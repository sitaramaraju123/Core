class BoysGirls{

public static void main(String[] args){

int boy=19;
int girl=17;

if(boy>=20 && girl>=18){

System.out.println("Both are eligible to get married");

}else if(boy>=20 && girl<18){

System.out.println("boy was eligible but not a girl");

}else if(boy<20 && girl>18){

System.out.println("Girl was eligible but not a boy");

}else{

System.out.println("Both are not eligible");

}

}

}