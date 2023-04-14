package clase3.accessModifier;

public class AccessModifier {

    public int num = 200;
    public int num2 = 500;
    private String name = "Cristopher";
    protected String lastname = "Saldaña";

    //Para un atributo privado usamos los getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
