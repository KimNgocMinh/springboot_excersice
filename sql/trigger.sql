create trigger rate_movie
    after insert
    on rate
    for each row
BEGIN
    SET @avg_score = ( select AVG(score) as avg_rate FROM (
                                                              select score from rate where movie_id = NEW.movie_id
                                                          ) as score_table);
    update movies set avg_rate = @avg_score where id = NEW.movie_id;
END;