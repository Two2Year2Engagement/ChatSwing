package com.chat.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

/**
 * 
 * @author wahrons
 * @Date 17/07/2015
 * @version 1.0
 */
public class PrincipalFrame implements Comparable<PrincipalFrame> {

	private JFrame principalFrame;

	private JPanel principalPanel;

	private TextAreaPanel textAreaPanel;

	public PrincipalFrame() {
		principalFrame = new JFrame();
		principalPanel = new JPanel();
	}

	public JFrame getPrincipalFrame() {
		return principalFrame;
	}

	public void setPrincipalFrame(JFrame principalFrame) {
		this.principalFrame = principalFrame;
	}

	public JPanel getPrincipalPanel() {
		return principalPanel;
	}

	public void setPrincipalPanel(JPanel principalPanel) {
		this.principalPanel = principalPanel;
	}

	public TextAreaPanel getTextAreaPanel() {
		return textAreaPanel;
	}

	public void setTextAreaPanel(TextAreaPanel textAreaPanel) {
		this.textAreaPanel = textAreaPanel;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				.add("principalFrame", principalFrame)
				.add("principalPanel", principalPanel)
				.add("textAreaPanel", textAreaPanel).toString();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(principalFrame, principalPanel, textAreaPanel);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof PrincipalFrame) {
			PrincipalFrame that = (PrincipalFrame) object;
			return Objects.equal(this.principalFrame, that.principalFrame)
					&& Objects.equal(this.principalPanel, that.principalPanel)
					&& Objects.equal(this.textAreaPanel, that.textAreaPanel);
		}
		return false;
	}

	@Override
	public int compareTo(PrincipalFrame that) {
		return ComparisonChain.start()
		// XXX field 'principalFrame' does not implements java.lang.Comparable
		// .compare(this.principalFrame, that.principalFrame)
		// XXX field 'principalPanel' does not implements java.lang.Comparable
		// .compare(this.principalPanel, that.principalPanel)
				.compare(this.textAreaPanel, that.textAreaPanel).result();
	}

}
