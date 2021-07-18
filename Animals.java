package Animal;
	

public class Animals {
	
	private String klass; //Класс животного
	private String otr; // Отряд животного
	private int age; //Возраст животного 
	private double ves; //Вес животного
	private int kon; //Кол-во конечностей
	private static boolean pit; //Питание (мясо или трава)
	
	
			public void findfood() {
				System.out.print("Ищет сено...");
			}
			public void eat() {
				System.out.print("Медленно жует сено");
			}
							
							
			//Конструктор без параметров
			public Animals() {
				
				
				age= 15;
				ves = 400.2; 
				klass = "Млекопитающее";
				otr = "Парнокопытные";
				kon = 4;
				pit = pit;
				
							
				
			}
	
	
			//Конструктор1 класс
			public Animals(String klass) {
				 
				this.klass = klass;
			}
			
			//Конструктор2  класс, отряд, питание
			public Animals(String klass, String otr, boolean pit) {
				
				this.klass = klass;
				this.otr = otr;
				this.pit = pit;
			}
			
			//Конструктор3 класс, отряд, вес, питание
			public Animals(String klass, double ves, String otr, boolean pit) {				
				this.klass = klass;
				this.ves = ves;
				this.otr = otr;
				this.pit = pit;
			}
			//Конструктор4 класс, отряд, возраст, питание
			public Animals( String klass, int age, String otr, boolean pit) {				
				this.klass = klass;
				this.age = age;
				this.otr = otr;
				this.pit = pit;
			}
			
			//Конструктор5  класс, отряд, вес, возраст, питание, кол-во конечностей
			public Animals(String klass, String otr, int age, double ves,int kon) {
				
				
				this.klass = klass;
				this.otr = otr;
				this.ves = ves;
				this.age = age;
				this.pit = true;
				this.kon = kon; 
				
			}
			
			
			
			

				//Вывод инфорамции о животном
				public void show() {
					String pitanie;
					if (pit == true)
					{ pitanie = "Трава";
					
					}
					else {
						pitanie = "Мясо";
					}
					
					
					
					System.out.println
							(" Класс: "+klass+
							" Отряд: "+otr+
							" Возраст : "+age+ " лет "+
							" Вес  "+ves+" кг"+
							" Питание :" +pitanie+
							" Кол-во конечностей: "+kon);
				}
			
				
			
	public static void main(String[] args) 
	
	{
		
	
		Animals Anim1 = new Animals("Млекопитающий","Парнокопытный",10,400.1,4);
		Anim1.show();
		Animals cow = new Animals();
		cow.findfood();
		cow.eat();
		
		
		
		
		

	}

}
