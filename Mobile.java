class Mobile
{

String modelSeries;
float size;
String display;

void callBy(int contactNum,String nameCaller)
{

System.out.println("This is user  "+"\n"+"Number ="+contactNum+"\n"+"Name ="+nameCaller);

}

int fingerprint(int fingerTouch)
{

return fingerTouch;

}
String simCard(String towerName)
{

return towerName;
}

public static void main(String []args)
{
Mobile realme=new Mobile();

realme.modelSeries="Realme 10";
realme.size=7.6f;
realme.display="Gorilla class";
System.out.println("Mobile Verfication.."+"\n"+realme.modelSeries+"\n"+realme.size+"\n"+realme.display);
realme.callBy(1000,"vel");
int left=realme.fingerprint(5);
String card=realme.simCard("Vodafone");
System.out.println(left+"\n"+card);

}
}

