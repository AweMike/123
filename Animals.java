package Animal;
	

public class Animals {
	
	private String klass; //����� ���������
	private String otr; // ����� ���������
	private int age; //������� ��������� 
	private double ves; //��� ���������
	private int kon; //���-�� �����������
	private static boolean pit; //������� (���� ��� �����)
	
	
			public void findfood() {
				System.out.print("���� ����...");
			}
			public void eat() {
				System.out.print("�������� ���� ����");
			}
							
							
			//����������� ��� ����������
			public Animals() {
				
				
				age= 15;
				ves = 400.2; 
				klass = "�������������";
				otr = "�������������";
				kon = 4;
				pit = pit;
				
							
				
			}
	
	
			//�����������1 �����
			public Animals(String klass) {
				 
				this.klass = klass;
			}
			
			//�����������2  �����, �����, �������
			public Animals(String klass, String otr, boolean pit) {
				
				this.klass = klass;
				this.otr = otr;
				this.pit = pit;
			}
			
			//�����������3 �����, �����, ���, �������
			public Animals(String klass, double ves, String otr, boolean pit) {				
				this.klass = klass;
				this.ves = ves;
				this.otr = otr;
				this.pit = pit;
			}
			//�����������4 �����, �����, �������, �������
			public Animals( String klass, int age, String otr, boolean pit) {				
				this.klass = klass;
				this.age = age;
				this.otr = otr;
				this.pit = pit;
			}
			
			//�����������5  �����, �����, ���, �������, �������, ���-�� �����������
			public Animals(String klass, String otr, int age, double ves,int kon) {
				
				
				this.klass = klass;
				this.otr = otr;
				this.ves = ves;
				this.age = age;
				this.pit = true;
				this.kon = kon; 
				
			}
			
			
			
			

				//����� ���������� � ��������
				public void show() {
					String pitanie;
					if (pit == true)
					{ pitanie = "�����";
					
					}
					else {
						pitanie = "����";
					}
					
					
					
					System.out.println
							(" �����: "+klass+
							" �����: "+otr+
							" ������� : "+age+ " ��� "+
							" ���  "+ves+" ��"+
							" ������� :" +pitanie+
							" ���-�� �����������: "+kon);
				}
			
				
			
	public static void main(String[] args) 
	
	{
		
	
		Animals Anim1 = new Animals("�������������","�������������",10,400.1,4);
		Anim1.show();
		Animals cow = new Animals();
		cow.findfood();
		cow.eat();
		
		
		
		
		

	}

}
