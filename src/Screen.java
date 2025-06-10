import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame{
    String tipoPessoa[] = {"", "Física", "Jurídica"};
    private JTextField txtCpf, txtNome, txtRg, txtOrgao, txtEmail, txtCep, txtUf, txtComp,
                   txtMunicipio, txtLogradouro, txtNumero, txtComplemento, txtBairro, txtTelefone;
    private JComboBox<String> dropPessoa;
    private JCheckBox checkBox;
    private JRadioButton radioAtivo, radioInativo;

    public Screen(){

        //Definindo comportamentos da tela
        setTitle("Cadastro de Pessoa");
        setSize(1050,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(252, 252, 252));

        //Alterando a fonte padrão dos componentes
        Font fonteInfo = new Font("Arial", Font.PLAIN, 14);
        Font fonteLabel = new Font("Arial", Font.BOLD, 14);
        UIManager.put("Label.font", fonteLabel);
        UIManager.put("Button.font", fonteInfo);
        UIManager.put("TextField.font", fonteInfo);
        UIManager.put("ComboBox.font", fonteInfo);
        UIManager.put("RadioButton.font", fonteInfo);
        UIManager.put("CheckBox.font", fonteInfo);
        
        // Título
        JLabel lblTitulo = new JLabel("Cadastro de Pessoa");
        lblTitulo.setBounds(40, 20, 400, 32);
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 30));
        lblTitulo.setForeground(new Color(255, 102, 0));

        //Tipo
        JLabel lblTipo = new JLabel("Tipo");
        lblTipo.setBounds(40, 70, 140, 30);
        lblTipo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTipo.setVerticalAlignment(SwingConstants.CENTER);

        //Tipo pessoa
        dropPessoa = new JComboBox<>(tipoPessoa);
        dropPessoa.setBounds(190, 70, 140, 30);

        //Cpf, Cnpj
        JLabel lblCpf = new JLabel("CPF / CNPJ ...");
        lblCpf.setBounds(340, 70, 140, 30);
        lblCpf.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
        lblCpf.setVerticalAlignment(SwingConstants.CENTER);

        //Cpf txt
        txtCpf = new JTextField();
        txtCpf.setBounds(495, 70, 250, 30);

        //Fornecedor
        JLabel lblFornecedor = new JLabel("Fornecedor");
        lblFornecedor.setBounds(765, 70, 140, 30);
        lblFornecedor.setFont(new Font("Arial", Font.PLAIN, 14));
        lblFornecedor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblFornecedor.setHorizontalAlignment(SwingConstants.CENTER);
        lblFornecedor.setVerticalAlignment(SwingConstants.CENTER);

        //Check
        checkBox = new JCheckBox();
        checkBox.setBounds(915, 75, 20, 20);

        //Nome
        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(40, 105, 140, 30);
        lblNome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblNome.setHorizontalAlignment(SwingConstants.CENTER);
        lblNome.setVerticalAlignment(SwingConstants.CENTER);

        //Nome txt
        txtNome = new JTextField();
        txtNome.setBounds(190, 105, 780, 30);

        //RG 
        JLabel lblRg = new JLabel("RG / Iscrição Estadual");
        lblRg.setBounds(40, 140, 140, 30);
        lblRg.setFont(new Font("Arial", Font.BOLD, 12));
        lblRg.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblRg.setHorizontalAlignment(SwingConstants.CENTER);
        lblRg.setVerticalAlignment(SwingConstants.CENTER);
        
        //RG txt
        txtRg = new JTextField();
        txtRg.setBounds(190, 140, 140, 30);

        //Orgão expedidor
        JLabel lblOrgao = new JLabel("Orgão Expedidor");
        lblOrgao.setBounds(340, 140, 140, 30);
        lblOrgao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblOrgao.setHorizontalAlignment(SwingConstants.CENTER);
        lblOrgao.setVerticalAlignment(SwingConstants.CENTER);

        //Orgão txt
        txtOrgao = new JTextField();
        txtOrgao.setBounds(490, 140, 140, 30);

        //Email
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(40, 175, 140, 30);
        lblEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
        lblEmail.setVerticalAlignment(SwingConstants.CENTER);

        //Email txt
        txtEmail = new JTextField();
        txtEmail.setBounds(190, 175, 290, 30);

        //CEP
        JLabel  lblCep = new JLabel("CEP");
        lblCep.setBounds(490, 175, 140, 30);
        lblCep.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblCep.setHorizontalAlignment(SwingConstants.CENTER);
        lblCep.setVerticalAlignment(SwingConstants.CENTER);

        //CEP txt
        txtCep = new JTextField();
        txtCep.setBounds(640, 175, 330, 30);

        //País
        JLabel lblPais = new JLabel("País");
        lblPais.setBounds(40, 210, 140, 30);
        lblPais.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblPais.setHorizontalAlignment(SwingConstants.CENTER);
        lblPais.setVerticalAlignment(SwingConstants.CENTER);

        //País escolha
        JLabel lblEscolha = new JLabel("BRASIL");
        lblEscolha.setBounds(190, 210, 290, 30);
        lblEscolha.setBackground(new Color(201, 201, 201));
        lblEscolha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblEscolha.setFont(new Font("Arial", Font.PLAIN, 14));

        //UF
        JLabel  lblUf = new JLabel("UF ...");
        lblUf.setBounds(490, 210, 140, 30);
        lblUf.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblUf.setHorizontalAlignment(SwingConstants.CENTER);
        lblUf.setVerticalAlignment(SwingConstants.CENTER);

        //UF txt
        txtUf = new JTextField();
        txtUf.setBounds(640, 210, 70, 30);

        //UF complemento
        txtComp = new JTextField();
        txtComp.setBackground(new Color(201, 201, 201));
        txtComp.setBounds(720, 210, 250, 30);

        //Município
        JLabel lblMunicipio = new JLabel("Município");
        lblMunicipio.setBounds(40, 245, 140, 30);
        lblMunicipio.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblMunicipio.setHorizontalAlignment(SwingConstants.CENTER);
        lblMunicipio.setVerticalAlignment(SwingConstants.CENTER);

        //Município txt
        txtMunicipio = new JTextField();
        txtMunicipio.setBackground(new Color(201, 201, 201));
        txtMunicipio.setBounds(190, 245, 780, 30);

        //Logradouro
        JLabel lblLogradouro = new JLabel("Logradouro");
        lblLogradouro.setBounds(40, 280, 140, 30);
        lblLogradouro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblLogradouro.setHorizontalAlignment(SwingConstants.CENTER);
        lblLogradouro.setVerticalAlignment(SwingConstants.CENTER);

        //Logradouro txt
        txtLogradouro = new JTextField();
        txtLogradouro.setBounds(190, 280, 780, 30);

        //Número
        JLabel lblNumero = new JLabel("Número");
        lblNumero.setBounds(40, 315, 140, 30);
        lblNumero.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumero.setVerticalAlignment(SwingConstants.CENTER);

        //Número txt
        txtNumero = new JTextField();
        txtNumero.setBounds(190, 315, 140, 30);

        //Complemento
        JLabel lblComplemento = new JLabel("Complemento");
        lblComplemento.setBounds(340, 315, 140, 30);
        lblComplemento.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblComplemento.setHorizontalAlignment(SwingConstants.CENTER);
        lblComplemento.setVerticalAlignment(SwingConstants.CENTER);

        //Complemento txt
        txtComplemento = new JTextField();
        txtComplemento.setBounds(490, 315, 480, 30);

        //Bairro
        JLabel lblBairro = new JLabel("Bairro");
        lblBairro.setBounds(40, 350, 140, 30);
        lblBairro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblBairro.setHorizontalAlignment(SwingConstants.CENTER);
        lblBairro.setVerticalAlignment(SwingConstants.CENTER);

        //Bairro txt
        txtBairro = new JTextField();
        txtBairro.setBounds(190, 350, 140, 30);

        //Telefone
        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(340, 350, 140, 30);
        lblTelefone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
        lblTelefone.setVerticalAlignment(SwingConstants.CENTER);

        //Telefone txt
        txtTelefone = new JTextField();
        txtTelefone.setBounds(490, 350, 140, 30);

        //Situação
        JLabel lblSituacao = new JLabel("Situação");
        lblSituacao.setBounds(640, 350, 140, 30);
        lblSituacao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblSituacao.setHorizontalAlignment(SwingConstants.CENTER);
        lblSituacao.setVerticalAlignment(SwingConstants.CENTER);

        //Ativo
        radioAtivo = new JRadioButton("Ativo");
        radioAtivo.setBackground(new Color(255, 255, 255));
        radioAtivo.setBounds(790, 350, 70, 30);

        //Inativo
        radioInativo = new JRadioButton("Inativo");
        radioInativo.setBackground(new Color(255, 255, 255));
        radioInativo.setBounds(860, 350, 70, 30);

        // Agrupar para que apenas um possa ser selecionado
        ButtonGroup grupoStatus = new ButtonGroup();
        grupoStatus.add(radioAtivo);
        grupoStatus.add(radioInativo);

        //Confirmar
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
            limparCampos();
        });
        btnConfirmar.setBounds(40, 400, 120, 30);
        btnConfirmar.setBackground(new Color(255, 102, 0));
        btnConfirmar.setForeground(Color.WHITE);

        //Excluir
        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.addActionListener(e -> limparCampos());
        btnExcluir.setBounds(170, 400, 120, 30);
        btnExcluir.setBackground(new Color(255, 102, 0));
        btnExcluir.setForeground(Color.WHITE);

        //Limpar
        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(e -> limparCampos());
        btnLimpar.setBounds(300, 400, 120, 30);
        btnLimpar.setBackground(new Color(201, 201, 201));

        //Adicionando os componentes na tela
        add(lblTitulo);
        add(lblTipo);
        add(dropPessoa);
        add(lblCpf);
        add(txtCpf);
        add(lblFornecedor);
        add(checkBox);
        add(lblNome);
        add(txtNome);
        add(lblRg);
        add(txtRg);
        add(lblOrgao);
        add(txtOrgao);
        add(lblEmail);
        add(txtEmail);
        add(lblCep);
        add(txtCep);
        add(lblPais);
        add(lblEscolha);
        add(lblUf);
        add(txtUf);
        add(txtComp);
        add(lblMunicipio);
        add(txtMunicipio);
        add(lblLogradouro);
        add(txtLogradouro);
        add(lblNumero);
        add(txtNumero);
        add(lblComplemento);
        add(txtComplemento);
        add(lblBairro);
        add(txtBairro);
        add(lblTelefone);
        add(txtTelefone);
        add(lblSituacao);
        add(radioAtivo);
        add(radioInativo);
        add(btnConfirmar);
        add(btnExcluir);
        add(btnLimpar);

        setVisible(true);
    }
    private void limparCampos() {
    txtCpf.setText("");
    txtNome.setText("");
    txtRg.setText("");
    txtOrgao.setText("");
    txtEmail.setText("");
    txtCep.setText("");
    txtUf.setText("");
    txtComp.setText("");
    txtMunicipio.setText("");
    txtLogradouro.setText("");
    txtNumero.setText("");
    txtComplemento.setText("");
    txtBairro.setText("");
    txtTelefone.setText("");
    dropPessoa.setSelectedIndex(0);
    checkBox.setSelected(false);
    radioAtivo.setSelected(false);
    radioInativo.setSelected(false);
}

}
