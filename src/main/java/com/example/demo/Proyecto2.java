package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@Getter
@Setter
@SpringBootApplication
public class Proyecto2 {
	private String nombre;
	private int edad;

	public Proyecto2() {
	}
	public Proyecto2(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public void ingresarDatos(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese su nombre: ");
		nombre = sc.nextLine();

		System.out.print("Ingrese su edad: ");
		edad = sc.nextInt();
	}

	public void mostrarDatos(){

		System.out.println("Su nombre es: "+ nombre + " y su edad es: " + edad);

	}

	public void verificarEdad1(){
		if(edad>27){
			System.out.println("Es mayor de edad");
		}else{
			System.out.println("Es menor de edad");
		}
	}

	public void verificarEdad2(){
		System.out.println(edad>21 ? "Es mayor de edad":"Es menor de edad");
	}
	public static void main(String[] args) {
		SpringApplication.run(Proyecto2.class, args);

		Proyecto2 project = new Proyecto2();

		project.ingresarDatos();

		project.mostrarDatos();

		project.verificarEdad1();

		project.verificarEdad2();
	}
}
