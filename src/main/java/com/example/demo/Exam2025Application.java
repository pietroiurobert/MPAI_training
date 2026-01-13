package com.example.demo;

import com.example.demo.dp_recap.Factory.Factory;
import com.example.demo.dp_recap.Factory.PachetTuristic;
import com.example.demo.dp_recap.Factory.TipPachet;
import com.example.demo.dp_recap.Observer.Newsletter;
import com.example.demo.dp_recap.Observer.Observer;
import com.example.demo.dp_recap.Observer.Subscriber;
import com.example.demo.dp_recap.Singleton.DataBaseConn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exam2025Application {

	public static void main(String[] args) {
		SpringApplication.run(Exam2025Application.class, args);

		DataBaseConn conn = DataBaseConn.getInstance();

		PachetTuristic pachet1 = new Factory().crearePachet(TipPachet.CAZARE);
		PachetTuristic pachet2 = new Factory().crearePachet(TipPachet.TRANSPORT);

		Observer newsletter = new Newsletter();
		Subscriber sub1 = new Subscriber("Robert");
		Subscriber sub2 = new Subscriber("Mihai");

		newsletter.addSubscriber(sub1);
		newsletter.addSubscriber(sub2);

		newsletter.sendPushNotification("Lalala");
	}
}
