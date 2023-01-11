public class App {
    public static void main(String[] args) throws Exception {
        
        disciplines newDiscipline = new disciplines();
        newDiscipline.discipline = "Cálculo";


        students newUser = new students();
        newUser.age = 22;
        newUser.name = "marquim";
        newUser.setCpf("149.149.149.99");


        newUser.disciplines = newDiscipline;

        System.out.println(newUser.name);
        System.out.println(newUser.age);
        System.out.println(newUser.disciplines.discipline);
        System.out.println(newUser.getCpf());
    }
}
