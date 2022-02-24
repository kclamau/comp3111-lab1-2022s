
package Lab1;

public class Library {
	
	public static void main(String arg[]) {
		Library lib=new Library();
		if(lib.someLibraryMethod())
		System.out.println("Hellow, World!");
	}
    public boolean someLibraryMethod() {
        return true;
    }
}