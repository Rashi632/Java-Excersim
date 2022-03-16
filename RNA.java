class RnaTranscription {
    String transcribe(String dnaStrand) {
        if(dnaStrand.length() == 0) {
            return "";
        }
        String head = transcribeByPart(dnaStrand.substring(0,1));
        String tail = transcribe(dnaStrand.substring(1));
        return head + tail;
    }
    String transcribeByPart(String dnaPart) {
        switch(dnaPart) {
            case "C":
                return "G";
            case "G":
                return "C";
            case "A":
                return "U";
            case "T":
                return "A";
        }
        throw new IllegalArgumentException("Invalid input");
    }
}