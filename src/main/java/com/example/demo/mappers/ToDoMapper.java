package com.example.demo.mappers;

import com.example.demo.entities.TODO;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ToDoMapper {

  @Select("select * from TBL_TODO")
  List<TODO> findAll();

  /*@Select("SELECT * FROM TBL_TODO WHERE id = #{id}")
  TODO findById(@Param("id") Long id);

  @Delete("DELETE FROM TBL_TODO WHERE id = #{id}")
  int deleteById(@Param("id") Long id);

  @Insert("INSERT INTO TBL_TODO(id, title, body) " +
      " VALUES (#{id}, #{title}, #{body})")
  int createNew(TODO item);

  @Update("Update TBL_TODO set title=#{title}, " +
      " body=#{body} where id=#{id}")
  int update(TODO item);*/
}

/*public interface ToDoMapper { 

  @Select("select * from TBL_TODO")
  List<TODO> findAll();
}*/
