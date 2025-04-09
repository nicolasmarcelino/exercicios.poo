class BROfficeDocument implements Viewer {
    String data;
    
    BROfficeDocument(String data) {
        this.data = data;
    }

    public String view() {
        return this.data;
    }
}