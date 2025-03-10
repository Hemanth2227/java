import java.util.HashSet;
import java.util.Set;

class Voter {
    private String voterId;
    private String name;
    private boolean hasVoted;

    public Voter(String voterId, String name) {
        this.voterId = voterId;
        this.name = name;
        this.hasVoted = false;
    }

    public String getVoterId() { return voterId; }
    public boolean hasVoted() { return hasVoted; }
    public void setHasVoted(boolean hasVoted) { this.hasVoted = hasVoted; }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Voter voter = (Voter) obj;
        return voterId.equals(voter.voterId);
    }
    public int hashCode() { return voterId.hashCode(); }
    public String toString() {
        return String.format("Voter ID: %s, Name: %s, Voted: %b", voterId, name, hasVoted);
    }
}

public class VotingSystem {
    private Set<Voter> voters = new HashSet<>();

    public void addVoter(Voter voter) {
        voters.add(voter);
    }

    public boolean checkVotingStatus(String voterId) {
        return voters.stream()
                .filter(v -> v.getVoterId().equals(voterId))
                .findFirst()
                .map(Voter::hasVoted)
                .orElse(false);
    }

    public void markAsVoted(String voterId) {
        voters.forEach(v -> {
            if (v.getVoterId().equals(voterId)) v.setHasVoted(true);
        });
    }

    public void displayVotedVoters() {
        voters.stream()
                .filter(Voter::hasVoted)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.addVoter(new Voter("V001", "Hemanth"));
        vs.addVoter(new Voter("V002", "Kumar"));
        vs.addVoter(new Voter("V003", "Ricky"));
        vs.addVoter(new Voter("V004", "Kiran"));
        vs.addVoter(new Voter("V005", "Sudheer"));

        vs.markAsVoted("V001");
        vs.markAsVoted("V003");
        System.out.println("Voter V001 has voted: " + vs.checkVotingStatus("V001"));
        System.out.println("Voter V002 has voted: " + vs.checkVotingStatus("V002"));
        System.out.println("Voter V003 has voted: " + vs.checkVotingStatus("V003"));
        System.out.println("Voter V004 has voted: " + vs.checkVotingStatus("V004"));
        System.out.println("Voter V005 has voted: " + vs.checkVotingStatus("V005"));
        System.out.println("\nVoters who have voted:");
        vs.displayVotedVoters();
    }
}