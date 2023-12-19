package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.mappers.ToDoMapper;
import com.example.demo.entities.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner
{
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private ToDoMapper todoMapper;

    @Override
    public void run(String... args) throws Exception {
	List<TODO> list = todoMapper.findAll();
	System.out.println("================????+++++ : " + list);

        /*TODO newItem = new TODO(2L, "title_2", "body_2");
        int createdCount = todoMapper.createNew(newItem);
        System.out.println("Created items count : " + createdCount);

        TODO item = todoMapper.findById(2L);
        System.out.println(item);

        int deletedCount = todoMapper.deleteById(2L);
        System.out.println("Deleted items count : " + deletedCount);

        TODO deletedItem = todoMapper.findById(2L);
        System.out.println("Deleted item should be null : " + deletedItem);*/
    }
}
