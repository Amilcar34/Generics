package json.casting;

import com.google.gson.Gson;

public class Main {

	public static void main(String... arg) {
		Gson gson = new Gson();
		String string = gson.toJson(new Persona("juan", 22));
		Persona persona2 = parse(string, Persona.class);
		System.out.println(persona2.toString());
		
		string = gson.toJson(new Trabajador("ramiro", 2,"ingeniero"));
		Trabajador trabajador = gson.fromJson(string, Trabajador.class);
		System.out.println(trabajador.toString());
	}
	private static <T> T parse(String string, Class<T> class1) {
		Gson gson = new Gson();
		T t = gson.fromJson(string, class1);
		return t;
	}
}
class Persona{
	String name;
	int age;
	public Persona(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Persona [name=" + name + ", age=" + age + "]";
	}
}
class Trabajador extends Persona{
	String puesto;
	public Trabajador(String name, int age, String puesto) {
		super(name, age);
		this.puesto = puesto;
	}
	@Override
	public String toString() {
		return "Trabajador [puesto=" + puesto + " name="+this.name+ "]";
	}
}