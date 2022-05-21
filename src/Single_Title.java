public class Single_Title {
    final String title;
    final String serious;
    final String type;
    final Integer value;
    final Integer PEGI;
    final String creator;

    public Single_Title(String title, String serious, String type, Integer value, Integer PEGI, String creator) {
        this.title = title;
        this.serious = serious;
        this.type = type;
        this.value = value;
        this.PEGI = PEGI;
        this.creator = creator;
    }

    String[] toArray() {
        return new String[] {title,serious,type,value.toString(),PEGI.toString(),creator};
    }
}
