package week04.schoolrecords;

public class Mark {
    private MarkType markType;
    private Subject subject;
    private Tutor tutor;


    public Mark(MarkType markType, Subject subject, Tutor tutor){
        this.markType = markType;
        this.subject = subject;
        this.tutor= tutor;
    }



   // public Mark(String markType, Subject subject, Tutor tutor){
   //     this.markType = ;
    //    this.subject = subject;
     //   this.tutor= tutor;



  //  }


    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public String toString(){return null;}
}
