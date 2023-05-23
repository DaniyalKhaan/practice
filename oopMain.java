import javax.swing.plaf.synth.SynthStyle;

// import java.time.LocalDate;

class oopMain{
    public static void main(String[] args) {

        oopUser user = new oopUser();
        user.name = "Daniyal";

        oopBook notes = new oopBook();
        notes.title = "Maths";
        notes.teacher = "Sir Zeeshan";

        user.borrow(notes);

        // System.out.printf("%s has borrowed this book %s by %s \n", user.name, notes.title, notes.teacher );
        

        System.out.printf("%s has borrowed this bool %s by %s \n",user.name, user.copy);
       

    }
}