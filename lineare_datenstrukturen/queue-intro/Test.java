public class Test {

    private Queue<User> queue = new Queue<User>();

    public Test() {}

    public void addUser(String pName, int pAge) {
        this.queue.enqueue(new User(pName, pAge));
    }

    public void removeFirstUser() {
        if (this.queue.isEmpty()) return;
        this.queue.dequeue();
    }

    public void printFirstUserDetails() {
        if (this.queue.isEmpty()) return;
        User user = this.queue.front();
        System.out.println(user.getName() + " ist " + user.getAge() + " Jahre alt.");
    }
}