package biz.shadowservices.DegreesToolbox.data;

import java.util.ArrayList;
import java.util.List;
/**
 * This class is for storing a menu of value packs
 * @author Jordan Thoms
 *
 */
public class PackTreeNode {
	private PackTreeNode parent;
	private String title;
	private List<PackTreeNode> children;
	private String questionText;
	
	public PackTreeNode(String title, String questionText) {
		this.title = title;
		this.questionText = questionText;
		this.children = new ArrayList<PackTreeNode>();
	}
	public PackTreeNode(String title) {
		this(title, null);
	}

	public void addChild(PackTreeNode newChild) {
		children.add(newChild);
	}
	public CharSequence[] getChildrenCharSequence() {
		List<String> sequence = new ArrayList<String>();
		for (PackTreeNode node : children) {
			sequence.add(node.getTitle());
		}
		return sequence.toArray(new CharSequence[sequence.size()]);
	}
	public List<PackTreeNode> getChildren() {
		return children;
	}
	public PackTreeNode getAt(int position) {
		return children.get(position);
	}
	public String getTitle() {
		return title;
	}
	public String getQuestionText() {
		return questionText;
	}
	public PackTreeNode getParent() {
		return parent;
	}
}
