class SuperClass {
    protected int field;


    protected int getField() {
        return field;
    }

    protected void printBaseValue() {
        System.out.println(field);
    }
}


class SubClass extends SuperClass{
    protected int field;


    public SubClass(){
        this.field = 30;
        field = 30;
        super.field = 20;
    }


    public void printSubValue() {
        super.printBaseValue();
        System.out.println(field);
    }
}