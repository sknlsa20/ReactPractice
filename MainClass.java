import com.src.Addition;
import com.sageit.Subtraction;
class MainClass
{
	public static void main(String arg[]){
	Addition ad=new Addition();

	System.out.println(ad.add(23,45));

	Subtraction su=new Subtraction();
	System.out.println(su.sub(45,32));
	
}

}