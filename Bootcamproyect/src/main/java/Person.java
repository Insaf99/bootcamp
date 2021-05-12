public abstract class Person { //abstract class
    static String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){return name;}

}

class farmer extends Person{     //inherence
    private static farmer instance; //Singleton
    public static farmer getInstance(String nom){              //Singleton
        if(instance == null) instance = new farmer();
        name=nom;
        return instance;
    }

    public void diference (String Color){
        HenHouse hen = new HenHouse("Franking farm",40); // instance of class
        System.out.println("===="+Color+"====");
        if (Color=="reds"){
            Collecteggs(((hen.getHennumber()*70/100)*2),"(D)");
        }
        else if (Color=="whites"){
            Collecteggs(((hen.getHennumber()*30/100)*2),"(O)");
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