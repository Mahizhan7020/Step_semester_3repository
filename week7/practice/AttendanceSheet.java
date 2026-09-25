class AttendanceSheet {
    private String[] names;
    private int count;
    AttendanceSheet(int size){
        names=new String[size];
        count=0;
    }
    public void markPresent(String name){
        if(!isPresent(name)&&count<names.length) names[count++]=name;
    }
    public int getPresentCount(){
        return count;
    }
    public boolean isPresent(String name){
        for(int i=0;i<count;i++) if(names[i].equals(name)) return true;
        return false;
    }
}
