public class Program {

    private BinaryTree<Ahne> ahnenbaum;

    public Program() {
        BinaryTree<Ahne> b1 = new BinaryTree<Ahne>(new Ahne("Jacqueline", "Bouvier", 'f'));
        BinaryTree<Ahne> b2 = new BinaryTree<Ahne>(new Ahne("Clancy", "Bouvier", 'm'));
        BinaryTree<Ahne> b3 = new BinaryTree<Ahne>(new Ahne("Marge", "Simpson", 'f'), b1, b2);
        BinaryTree<Ahne> b4 = new BinaryTree<Ahne>(new Ahne("Mona", "Simpson", 'f'));
        BinaryTree<Ahne> b5 = new BinaryTree<Ahne>(new Ahne("Abraham J.", "Simpson", 'm'));
        BinaryTree<Ahne> b6 = new BinaryTree<Ahne>(new Ahne("Homer", "Simpson", 'm'), b4, b5);
        
        this.ahnenbaum = new BinaryTree<Ahne>(new Ahne("Lisa", "Simpson", 'f'), b3, b6);
    }


    // PREORDER
    public void startPreorder() {
        this.preorder(this.ahnenbaum);
    }


    private void preorder(BinaryTree<Ahne> pKnoten) {
        if (pKnoten != null && !pKnoten.isEmpty()) {
            System.out.println(pKnoten.getContent().getVorname() + " " + pKnoten.getContent().getNachname());
            this.preorder(pKnoten.getLeftTree());
            this.preorder(pKnoten.getRightTree());
        }
    }


    // POSTORDER
    public void startPostorder() {
        this.postorder(this.ahnenbaum);
    }


    private void postorder(BinaryTree<Ahne> pKnoten) {
        if (pKnoten != null && !pKnoten.isEmpty()) {
            this.postorder(pKnoten.getLeftTree());
            this.postorder(pKnoten.getRightTree());
            System.out.println(pKnoten.getContent().getVorname() + " " + pKnoten.getContent().getNachname());
        }
    }


    // INORDER
    public void startInorder() {
        this.inorder(this.ahnenbaum);
    }


    private void inorder(BinaryTree<Ahne> pKnoten) {
        if (pKnoten != null && !pKnoten.isEmpty()) {
            this.inorder(pKnoten.getLeftTree());
            System.out.println(pKnoten.getContent().getVorname() + " " + pKnoten.getContent().getNachname());
            this.inorder(pKnoten.getRightTree());
        }
    }
}