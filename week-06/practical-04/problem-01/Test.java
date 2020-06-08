//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Number: 4
//===================================

public class Test {
    public static void main(String[] args) {
        
        // Create hanoi tower with 7 disks
        //HanoiTower tower = new HanoiTower(3);

        // Solve  the hanoi tower
        // tower.solve();

        // Create hanoi tower with 7 disks
        HanoiTowerGUI towerGUI = new HanoiTowerGUI(5);

        // Solve  the hanoi tower
        towerGUI.solve();

    }
}