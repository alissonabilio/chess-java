package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Board;
import com.example.demo.model.Position;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Position po = new Position(2, 5);
		Board board = new Board(8, 8);
		System.out.println(po);
		System.out.println(board);
	}

}
