# ChatSwing

@see http://wiki.sj.ifsc.edu.br/wiki/index.php/Trabalhando_com_sockets_TCP_em_Java

@see http://www.cise.ufl.edu/~amyles/tutorials/tcpchat/

@see http://www.oracle.com/technetwork/java/architecture-142923.html#modified_mvc




    Brief Summary

        You’re the user — you interact with the view. The controller takes your actions and interprets them. If you click on a button, it’s the controller’s job to figure out what that means and how the model should be manipulated based on that action.
        
        The controller asks the model to change its state. When the controller receives an action from the view, it may need to tell the view to change as a result. For example, the controller could enable or disable certain buttons or menu items in the interface.
        
        The controller may also ask the view to change. When something changes in the model, based either on some action you took (like clicking a button) or some other internal change (like the next song in the playlist has started), the model notifies the view that its state has changed.
        
        The model notifies the view when its state has changed. When something changes in the model, based either on some action you took (like clicking a button) or some other internal change (like the next song in the playlist has started), the model notifies the view that its state has changed.
        
        The view asks the model for state. The view gets the state it displays directly from the model. For instance, when the model notifies the view that a new song has started playing, the view requests the song name from the model and displays it. The view might also ask the model for state as the result of the controller requesting some change in the view.
[2004]Head First Design Patterns by Freeman and Freeman



Swing Models

Component 	Model Interface 	Model Type

JButton 	ButtonModel 	GUI

JToggleButton 	ButtonModel 	GUI/data

JCheckBox 	ButtonModel 	GUI/data

JRadioButton 	ButtonModel 	GUI/data

JMenu 	ButtonModel 	GUI

JMenuItem 	ButtonModel 	GUI

JCheckBoxMenuItem 	ButtonModel 	GUI/data

JRadioButtonMenuItem 	ButtonModel 	GUI/data

JComboBox 	ComboBoxModel 	data

JProgressBar 	BoundedRangeModel 	GUI/data

JScrollBar 	BoundedRangeModel 	GUI/data

JSlider 	BoundedRangeModel 	GUI/data

JTabbedPane 	SingleSelectionModel 	GUI

JList 	ListModel 	data

JList 	ListSelectionModel 	GUI

JTable 	TableModel 	data

JTable 	TableColumnModel 	GUI

JTree 	TreeModel 	data

JTree 	TreeSelectionModel 	GUI

JEditorPane 	Document 	data

JTextPane 	Document 	data

JTextArea 	Document 	data

JTextField 	Document 	data

JPasswordField 	Document 	data 
