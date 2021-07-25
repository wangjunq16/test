## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

bt1.addActionListener((ActionListener) this);
@Override
    public void actionPerformed(ActionEvent e) {        
        if(e.getSource()==bt1)
        {
            this.dispose();//点击按钮时frame1销毁,new一个frame2
            new Gui2();
        }
    }