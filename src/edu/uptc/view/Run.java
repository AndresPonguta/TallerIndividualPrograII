package edu.uptc.view;

import java.time.LocalDate;
import java.time.Month;

import javax.swing.JOptionPane;
import edu.uptc.logic.*;

public class Run {

	public static void main(String[] args) {
		Registered registered = new Registered(null, null, null, null, null, null);
		Occasional ocassional = new Occasional(null, null, null, null, null, null);
		// Target target = new Target("sfg", "sdfg", 0, 0);
		// Airplane airplane = new Airplane("wsdfg", (short) 0, (short) 0,
		// null);
		boolean selection = true;

		while (selection == true) {
			String options[] = { "Registrado", "Ocasional", "Salir" };
			int option = JOptionPane.showOptionDialog(null, "Seleccione el tipo de pasajero", "Empresa de vuelos",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			switch (option) {
			case 0:
				JOptionPane.showMessageDialog(null, "Ingrese los datos a continuacion:");
				registered.setIdPassenger(JOptionPane.showInputDialog(null, "Número de identificacion"));
				registered.setFistName(JOptionPane.showInputDialog(null, "Primer nombre"));
				registered.setLastName(JOptionPane.showInputDialog(null, "Primer apellido"));
				registered.setCountry(JOptionPane.showInputDialog(null, "País de origen"));
				registered.setDateBirthday(LocalDate.of(
						Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el año de nacimiento")),
						(Month.of(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes de nacimiento")))),
						Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el dia de nacimiento"))));
				registered.setDateRegister((LocalDate.now()));

				break;

			case 1:
				JOptionPane.showMessageDialog(null, "Ingrese los datos a continuacion:");
				ocassional.setIdPassenger(JOptionPane.showInputDialog(null, "Número de identificacion"));
				ocassional.setFistName(JOptionPane.showInputDialog(null, "Primer nombre"));
				ocassional.setLastName(JOptionPane.showInputDialog(null, "Primer apellido"));
				ocassional.setCountry(JOptionPane.showInputDialog(null, "País de origen"));
				ocassional.setDateBirthday(LocalDate.of(
						Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el año de nacimiento")),
						(Month.of(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes de nacimiento")))),
						Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el dia de nacimiento"))));
				JOptionPane.showMessageDialog(null, "Ingrese la fecha de su ultimo vuelo");
				ocassional.setDateLastFly(LocalDate.of(Integer.parseInt(JOptionPane.showInputDialog(null, "año")),
						(Month.of(Integer.parseInt(JOptionPane.showInputDialog(null, "mes")))),
						Integer.parseInt(JOptionPane.showInputDialog(null, "dia"))));

				break;

			default:
				selection = false;
				break;
			}
		}

	}

}
