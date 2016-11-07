public class MergeIntervalList {
    public static void main(String[] args) {
        INode l1 = new INode(1, 5, new INode(10, 14, new INode(16, 16)));
        INode l2 = new INode(2, 6, new INode(8, 10, new INode(11, 20)));
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(merge(l1, l2));
    }

    public static INode merge(INode l1, INode l2) {
        INode ret = null;
        INode curr = ret;
        while (l1 != null && l2 != null) {
            if (ret == null) {
                ret = new INode(l1.s < l2.s ? l1 : l2);
                curr = ret;
            } else {
                INode smallNode = l1.s < l2.s ? l1 : l2;
                if (smallNode.s <= curr.e) {
                    curr.e = Math.max(smallNode.e, curr.e);
                } else {
                    curr.next = new INode(smallNode);
                    curr = curr.next;
                }
            }
            if (l1.s < l2.s) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
        }
        if (l1 != null || l2 != null) {
            INode remainingNode = l1 != null ? l1 : l2;
            while (remainingNode != null) {
                if (remainingNode.s <= curr.e) {
                    curr.e = Math.max(remainingNode.e, curr.e);
                } else {
                    curr.next = new INode(remainingNode);
                    curr = curr.next;
                }
                remainingNode = remainingNode.next;
                curr = curr.next;
            }
        }
        return ret;
    }

    static class INode {
        public int s;
        public int e;
        public INode next;

        public INode(int s, int e) {
            this(s, e, null);
        }

        public INode(int s, int e, INode next) {
            this.s = s;
            this.e = e;
            this.next = next;
        }
        
        public INode(INode node) {
            this.s = node.s;
            this.e = node.e;
        }

        public String toString() {
            String ret = "(" + s + "," + e +")";
            INode curr = next;
            while (curr != null) {
                ret += ", (" + curr.s + "," + curr.e +")";
                curr = curr.next;
            }
            return ret;
        }
    } 
}