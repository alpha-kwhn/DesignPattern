//2017112071 김응관
package Week12.P3;

public class TopicList implements List<Topic>{
    private Topic[] Topics;
    private int num = 0;

    public TopicList(Topic[] topic){
        Topics = topic;
    }

    @Override
    public Iterator<Topic> iterator() {
        return new ConcreteIterator(Topics);
    }
}
