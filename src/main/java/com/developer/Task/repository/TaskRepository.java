package com.developer.Task.repository;

import com.developer.Task.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Long>  {


    @Query(value="SELECT  t2.* FROM \n" +
            " ( SELECT kolumna1   FROM public.tabela_testowa  group by kolumna1 having  count(*) >1 ) as t1 \n" +
            " Inner join  ( select * from public.tabela_testowa ) as t2 ON t1.kolumna1 = t2.kolumna1 " , nativeQuery=true)
    List<TaskEntity> UniqueKolumna1();

    @Query(value="SELECT  t2.* FROM\n" +
            " (SELECT kolumna2   FROM public.tabela_testowa  group by kolumna2 having  count(*) >1) t1\n" +
            " Inner join  (select * from public.tabela_testowa) t2 ON t1.kolumna2 = t2.kolumna2 " , nativeQuery=true)
    List<TaskEntity> UniqueKolumna2();

    @Query(value="SELECT  t2.* FROM\n" +
            " (SELECT kolumna3   FROM public.tabela_testowa  group by kolumna3 having  count(*) >1) t1\n" +
            " Inner join  (select * from public.tabela_testowa) t2 ON t1.kolumna3 = t2.kolumna3 " , nativeQuery=true)
    List<TaskEntity> UniqueKolumna3();

    @Query(value="SELECT  t2.* FROM\n" +
            " (SELECT kolumna4   FROM public.tabela_testowa  group by kolumna4 having  count(*) >1) t1\n" +
            " Inner join  (select * from public.tabela_testowa) t2 ON t1.kolumna4 = t2.kolumna4" , nativeQuery=true)
    List<TaskEntity> UniqueKolumna4();

    @Query(value="SELECT  t2.* FROM \n" +
            " ( SELECT kolumna1   FROM public.tabela_testowa  group by kolumna1 having  count(*) = 1 ) as t1 \n" +
            " Inner join  ( select * from public.tabela_testowa ) as t2 ON t1.kolumna1 = t2.kolumna1 " , nativeQuery=true)
    List<TaskEntity> NoUniqueKolumna1();

    @Query(value="SELECT  t2.* FROM\n" +
            " (SELECT kolumna2   FROM public.tabela_testowa  group by kolumna2 having  count(*) = 1) t1\n" +
            " Inner join  (select * from public.tabela_testowa) t2 ON t1.kolumna2 = t2.kolumna2 " , nativeQuery=true)
    List<TaskEntity> NoUniqueKolumna2();

    @Query(value="SELECT  t2.* FROM\n" +
            " (SELECT kolumna3   FROM public.tabela_testowa  group by kolumna3 having  count(*) = 1) t1\n" +
            " Inner join  (select * from public.tabela_testowa) t2 ON t1.kolumna3 = t2.kolumna3 " , nativeQuery=true)
    List<TaskEntity> NoUniqueKolumna3();

    @Query(value="SELECT  t2.* FROM\n" +
            " (SELECT kolumna4   FROM public.tabela_testowa  group by kolumna4 having  count(*) = 1) t1\n" +
            " Inner join  (select * from public.tabela_testowa) t2 ON t1.kolumna4 = t2.kolumna4" , nativeQuery=true)
    List<TaskEntity> NoUniqueKolumna4();




}
