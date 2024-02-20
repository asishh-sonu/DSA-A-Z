import java.util.ArrayList;
import java.util.List;

class FamilyMember {
    private String name;
    private List<FamilyMember> children;

    public FamilyMember(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addChild(FamilyMember child) {
        if (child != null) {
            children.add(child);
        }
    }

    public List<FamilyMember> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    private String displayRelationship(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("  "); // Indentation for clarity
        }
        return sb.toString();
    }

    public void displayFamilyTree(int level) {
        System.out.println(displayRelationship(level) + name);
        for (FamilyMember child : children) {
            child.displayFamilyTree(level + 1);
        }
    }
}

public class FamilyTree {
    private FamilyMember root;

    public FamilyTree(FamilyMember root) {
        this.root = root;
    }

    public void displayFamilyTree() {
        if (root != null) {
            root.displayFamilyTree(0);
        } else {
            System.out.println("The family tree is empty.");
        }
    }

    public static void main(String[] args) {
        // Create family members
        FamilyMember grandparent1 = new FamilyMember("Grandparent 1");
        FamilyMember grandparent2 = new FamilyMember("Grandparent 2");

        FamilyMember parent1 = new FamilyMember("Parent 1");
        FamilyMember parent2 = new FamilyMember("Parent 2");

        FamilyMember child1 = new FamilyMember("Child 1");
        FamilyMember child2 = new FamilyMember("Child 2");

        // Add children
        grandparent1.addChild(parent1);
        grandparent2.addChild(parent2);

        parent1.addChild(child1);
        parent2.addChild(child2);

        // Create and display family tree
        FamilyTree familyTree = new FamilyTree(grandparent1);
        familyTree.displayFamilyTree();
    }
}
