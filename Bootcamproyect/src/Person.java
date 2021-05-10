public abstract class Person { //abstract class
    String name;
}

class farmer extends Person{     //inherence
    private static farmer instance; //Singleton
    public void setName(String name){
        this.name=name;
    }

    public static farmer getInstance(){              //Singleton
        if(instance == null) instance = new farmer();
        return instance;
    }

    public void diference (String Color){
        final int hens=40;
        System.out.print("===="+Color+"====");
        if (Color=="reds"){
            Collecteggs(((hens*70/100)*2),"(D)");
        }
        else if (Color=="whites"){
            Collecteggs(((hens*30/100)*2),"(O)");
        }
    }

    public void Collecteggs(int value, String color){
        String carton[] []=new String[6][5];
        while (value>0){    // check that I have no eggs for recollect
            System.out.println(" ");
            for(int i=0;i<=carton.length-1;i++){
                for(int j=0;j<=carton[i].length-1;j++){
                    if (value==0){ System.out.print("(G)"); }
                    else{
                        System.out.print(color);
                        value-=1; } }
                System.out.println(" "); } } } }