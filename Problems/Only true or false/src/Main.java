class Primitive {
    public static boolean toPrimitive(Boolean b) {

        try {
            return b;
        }catch (NullPointerException e){
            return false;
        }

    }
}