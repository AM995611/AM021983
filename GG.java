import java.util.*;
import java.util.Random;

public class GG{

	public static void main(String[] args)
	{

	Scanner input = new Scanner( System.in );
	Random ran = new Random();
	int i;


	System.out.println("�п�ܥ\��:");
	System.out.println("1.�e�R");
	System.out.println("2.�Ʀr�C��");
	System.out.println("3.");
	System.out.println("4.���}");

	i=input.nextInt();

	while(i!=4){

	if(i==1){

		divine();

			}
	else if(i==2){

		number();

			}
	else if(i==3){

		

			}
	else{

		System.out.println("��J���~");

			}

	System.out.println("�п�ܥ\��:");
	System.out.println("1.�e�R");
	System.out.println("2.�Ʀr�C��");
	System.out.println("3.");
	System.out.println("4.���}");

	i=input.nextInt();

		}	

	
	}



	public static void divine(){

		int chose,p=0,i,j;
		int lucky=0;
		int[] L={0,0,0,0};
		int[] num={1,2,3};

		Scanner input = new Scanner( System.in );
		Random ran = new Random();

		System.out.println("�Ĥ@�D ��ܧA���w���C��:");
		System.out.println("1.��");
		System.out.println("2.��");
		System.out.println("3.��");
		chose=input.nextInt();
		
		for(i=0;i<=2;i++){
			j=ran.nextInt(3);
			while(num[j]==0){
				j=ran.nextInt(3);
					}
				L[i]=num[j];
				num[j]=0;
			}

		/*System.out.println(L[0]+" "+L[1]+" "+L[2]);*/

		while(p!=1){
			if(chose==1){
				lucky=lucky+L[0];
				p=1;
				}
			else if(chose==2){
				lucky=lucky+L[1];
				p=1;
				}
			else if(chose==3){
				lucky=lucky+L[2];
				p=1;
				}
			else{
				System.out.println("��J���~ ���s��J:");
				chose=input.nextInt();
				}

			}

		p=0;
		num[0]=1;
		num[1]=2;
		num[2]=3;
		System.out.println("�ĤG�D �̪�ı��ܤ@�Ӧ۵M����:");
		System.out.println("1.��");
		System.out.println("2.��");
		System.out.println("3.��");
		chose=input.nextInt();

		for(i=0;i<=2;i++){
			j=ran.nextInt(3);
			while(num[j]==0){
				j=ran.nextInt(3);
					}
				L[i]=num[j];
				num[j]=0;
			}
		while(p!=1){
			if(chose==1){
				lucky=lucky+L[0];
				p=1;
				}
			else if(chose==2){
				lucky=lucky+L[1];
				p=1;
				}
			else if(chose==3){
				lucky=lucky+L[2];
				p=1;
				}
			else{
				System.out.println("��J���~ ���s��J:");
				chose=input.nextInt();
				}

			}

		p=0;
		num[0]=1;
		num[1]=2;
		num[2]=3;
		System.out.println("�ĤT�D �p�G���ѭn�X�h���| �п�ܬ��|�a�I:");
		System.out.println("1.����");
		System.out.println("2.�ʪ�����");
		System.out.println("3.�C�ֶ�");
		chose=input.nextInt();

		for(i=0;i<=2;i++){
			j=ran.nextInt(3);
			while(num[j]==0){
				j=ran.nextInt(3);
					}
				L[i]=num[j];
				num[j]=0;
			}
		while(p!=1){
			if(chose==1){
				lucky=lucky+L[0];
				p=1;
				}
			else if(chose==2){
				lucky=lucky+L[1];
				p=1;
				}
			else if(chose==3){
				lucky=lucky+L[2];
				p=1;
				}
			else{
				System.out.println("��J���~ ���s��J:");
				chose=input.nextInt();
				}

			}

		p=0;
		num[0]=1;
		num[1]=2;
		num[2]=3;
		System.out.println("�ĥ|�D �п�ܧA���ȥ��\������:");
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.�j��إq");
		chose=input.nextInt();

		for(i=0;i<=2;i++){
			j=ran.nextInt(3);
			while(num[j]==0){
				j=ran.nextInt(3);
					}
				L[i]=num[j];
				num[j]=0;
			}
		while(p!=1){
			if(chose==1){
				lucky=lucky+L[0];
				p=1;
				}
			else if(chose==2){
				lucky=lucky+L[1];
				p=1;
				}
			else if(chose==3){
				lucky=lucky+L[2];
				p=1;
				}
			else{
				System.out.println("��J���~ ���s��J:");
				chose=input.nextInt();
				}

			}
		p=0;
		num[0]=1;
		num[1]=2;
		num[2]=3;
		System.out.println("�̫�@�D ���Ѧb���W�����T���� �п�ܤ@��:");
		System.out.println("1.��");
		System.out.println("2.��");
		System.out.println("3.�k");
		chose=input.nextInt();

		for(i=0;i<=2;i++){
			j=ran.nextInt(3);
			while(num[j]==0){
				j=ran.nextInt(3);
					}
				L[i]=num[j];
				num[j]=0;
			}
		while(p!=1){
			if(chose==1){
				lucky=lucky+L[0];
				p=1;
				}
			else if(chose==2){
				lucky=lucky+L[1];
				p=1;
				}
			else if(chose==3){
				lucky=lucky+L[2];
				p=1;
				}
			else{
				System.out.println("��J���~ ���s��J:");
				chose=input.nextInt();
				}

			}

		if(lucky<6){
			System.out.println("�̪�B���I�G �Цh�p��...");
			}
		if(lucky>5 && lucky<9){
			System.out.println("�̪�|���I�p���� �`�N�@�Ǥp�Ӹ`...");
			}
		if(lucky>8 && lucky<15){
			System.out.println("�ͬ��|�Z���Q�� �٤���~");
			}
		if(lucky>14){
			System.out.println("�B��n���F ����!!");
			}

	}

	public static void number(){

	Scanner input = new Scanner( System.in );
	Random ran = new Random();


	long time1,time2,timetotal;
	int a1,t1,t2,t3,t4,t5,a3,a4,r1,r2;
	float a2,t2345;
	int[][] p={
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},};

	System.out.println("�C������:");
	System.out.println("���T�����d �Хγ̧֪��ɶ��������q��");
	System.out.println("�|�γq���ɶ��ӵ���");
	System.out.println("�����C���}�l");

	try{
		Thread.sleep(5000);
	}catch(InterruptedException e){
		System.out.println("���~");
	}

	time1 = System.currentTimeMillis();/*�p�ɶ}�l*/

	System.out.println("LEVEL 1:");
	System.out.println("�бq1-10���q�X�q���諸�Ʀr");
	t1=ran.nextInt(10)+1;
	/*System.out.println(t1);*/
	a1=input.nextInt();
	while(a1!=t1){
	System.out.println("�q���F �g�@�[1��");
	try{
		Thread.sleep(1000);
	}catch(InterruptedException e){
		System.out.println("���~");
	}
	System.out.println("�A�դ@��");
	a1=input.nextInt();
	}
	System.out.println("�L��!");


	System.out.println("LEVEL 2:");
	System.out.println("��X�H�U�|�ƪ�������");
	t2=ran.nextInt(100)+1;
	t3=ran.nextInt(100)+1;
	t4=ran.nextInt(100)+1;
	t5=ran.nextInt(100)+1;
	System.out.println(t2+"  "+t3+"  "+t4+"  "+t5);
	t2345=((float)t2+(float)t3+(float)t4+(float)t5)/4;
	/*System.out.println(t2345);*/
	a2=input.nextFloat();
	while(a2!=t2345){
	System.out.println("�q���F �g�@�[2��");
	try{
		Thread.sleep(2000);
	}catch(InterruptedException e){
		System.out.println("���~");
	}
	System.out.println("�A�դ@��");
	a2=input.nextFloat();
	}
	System.out.println("�L��!");


	System.out.println("LEVEL 3:");
	System.out.println("�Ч�X1�b��");
	r1=ran.nextInt(10);
	r2=ran.nextInt(10);
	p[r1][r2]=1;

	for(r1=0;r1<10;r1++){
		for(r2=0;r2<10;r2++){
			System.out.print(p[r1][r2]);
			}
		System.out.println();
	}
	System.out.println("��:");
	a3=input.nextInt();
	System.out.println("�C:");
	a4=input.nextInt();
	while(p[a3-1][a4-1]!=1){
		System.out.print("���~ �g�@2��");
		try{
		Thread.sleep(2000);
		}catch(InterruptedException e){
		System.out.println("���~");
		}
		System.out.println("�A�դ@��");
		System.out.println("��:");
		a3=input.nextInt();
		System.out.println("�C:");
		a4=input.nextInt();
		}	
	System.out.println("�L��!");

	time2 = System.currentTimeMillis();/*�p�ɵ���*/
	timetotal=(time2-time1)/1000;
	System.out.println("��F"+timetotal+"��");
	if(timetotal<=13){
		System.out.println("����S�� �ӯ���!!");
		}else if(timetotal<=18){
		System.out.println("����A�� OP!");
		}else if(timetotal<=23){
		System.out.println("����B�� �������");
		}else if(timetotal<=28){
		System.out.println("����C�� ���I��");
		}else{
		System.out.println("����D�� �屼���m��");
		}

	}

}