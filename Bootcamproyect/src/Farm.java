public class Farm {
    public String name;

    void setName(String nom){
        name = nom;
    }}

class HenHouse extends Farm{  //inherence
    int hennumber;
    void setHennumber(int cap){
        hennumber=cap;
    }}