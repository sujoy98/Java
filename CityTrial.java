
class CityTrial extends City{
        public static void main(String[] args){
        City metro1,metro2;
        metro1=new City();
        metro2=new City();
        metro1.name="Delhi";
        metro1.population=1000;
        metro2.name="Bangalore";
        metro2.population=5000;
        System.out.println("Details : ");
        metro1.display();
        metro2.display();
    }
}

