package day14_practice_tasks.car_task;
// 3. Create a Child Interface of AutoPark Named 'AutoPilot':
// Note: Use the 'extends' keyword for inheritance.
public interface AutoPilot extends AutoPark{

    // Variables:
    boolean hasAutoPilot = true;

    // Abstract Method
    void selfDrive();

}
