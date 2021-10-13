class Pillow{
String name;
int cost;
void sleep(){
System.out.println(name +" pillow gives comfortable sleep");
}

public static void main(String[] args){
Pillow pil=new Pillow();
pil.name="Pooja";
pil.cost=100;
pil.sleep();
System.out.println(pil.name);
}
}
