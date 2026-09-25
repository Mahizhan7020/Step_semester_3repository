class NameTag {
    private final String first;
    private final String last;
    NameTag(String full){
        String[] parts=full.split(" ");
        first=parts[0];
        last=parts[1];
    }
    public String getNickname(){
        return first+" "+last.charAt(0)+".";
    }
}
