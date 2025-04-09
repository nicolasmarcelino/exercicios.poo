class WordDocument implements Viewer {
    String data;

    WordDocument(String data) {
        this.data = data;
    }

    public String view() {
        return this.data;
    }
}
