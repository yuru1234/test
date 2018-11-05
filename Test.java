package object01;

public class Test {

	public static void main(String[] args) {
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;

		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;

		Person izumi = new Person();
		izumi.name = "五丿井いずみ";
		izumi.age = 26;
		izumi.phoneNumber = "12345678";
		izumi.address = "machida";


		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(izumi.name);
		System.out.println(izumi.age);
		System.out.println(izumi.phoneNumber);
		System.out.println(izumi.address);

		hanako.talk();
		hanako.walk();
		hanako.run();

		Robot aibo = new Robot();
		aibo.name = "aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name = "asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name = "pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
