class Test {

    public static void main(String[] args) {
        
        Bicycle[] inventory = {new ElectricBike(1, "Green", 2012, 3 , false, "03-04-2020", "Not Checked out", "Becky G.",30.0d),
        new MountainBike(2, "Light Blue", 2019, 21 , false, "16-03-2020", "Not Checked out", "Karol G.","Shimano 43 Plus","KHS 2.4"),
        new RoadBike(3, "Red", 1942, 7 , false, "14-03-2020", "Not Checked out", "Wisin Y.","Swalve Extra"),
        new Hibrid(4, "White", 2005, 14 , true, "01-04-2020", "Not Checked out", "Becky G.","Shimano360"),
        new RoadBike(5, "Black", 2012, 21 , true, "02-02-2020", "30-03-2020", "Wisin Y.","Kmart Cheap Value suspension"),
        };

        inventory[0].chargeBike();

    }

}