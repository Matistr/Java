package proyecto2;
public class Datos extends javax.swing.JFrame {
    String vendedores[][]=new String[10][8];
    int cont=0;
    int precioAli1=Principal.precioAli1, precioAli2=Principal.precioAli2, precioAli3=Principal.precioAli3, precioAmz1=Principal.precioAmz1,precioAmz2=Principal.precioAmz2,precioAmz3=Principal.precioAmz3;
    float comA=Principal.comA,comB=Principal.comB,comC=Principal.comC;
    // Se asignan los valores de precios y comisiones de el metodo principal a variables locales
    public Datos() {
        for(int x=0;x<10;x++){
            for(int z=0;z<8;z++){
                vendedores[x][z]="0";
                // Inicializa la matriz vendedores con ceros en forma de String para que al recorrerlo no tenga nada en 'null'
            }
        }
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ALI1 = new javax.swing.JLabel();
        VentaTotal = new javax.swing.JLabel();
        cantVend1 = new javax.swing.JLabel();
        AMZ1 = new javax.swing.JLabel();
        ALI2 = new javax.swing.JLabel();
        ALI3 = new javax.swing.JLabel();
        AMZ3 = new javax.swing.JLabel();
        Monto3 = new javax.swing.JLabel();
        comisionB = new javax.swing.JLabel();
        ComTotal = new javax.swing.JLabel();
        Monto2 = new javax.swing.JLabel();
        cantVend3 = new javax.swing.JLabel();
        cantVend2 = new javax.swing.JLabel();
        comisionC = new javax.swing.JLabel();
        AMZ2 = new javax.swing.JLabel();
        Monto1 = new javax.swing.JLabel();
        comisionA = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        vendedor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        codVendedor = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        totProd = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Captura de pantalla_28-5-2024_204823_www.bing.com.jpeg"))); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel31.setText("jLabel12");

        jLabel32.setText("jLabel12");

        jLabel35.setText("jLabel12");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Captura de pantalla_3-6-2024_20244_www.bing.com.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Captura de pantalla_3-6-2024_20217_www.bing.com.jpeg"))); // NOI18N
        jLabel3.setText("jLabel1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Captura de pantalla_28-5-2024_204823_www.bing.com.jpeg"))); // NOI18N
        jLabel4.setText("jLabel1");

        jLabel5.setText("Precio Amazon:");

        jLabel6.setText("Precio Alibaba:");

        jLabel7.setText("Cantidad Vendida:");

        jLabel8.setText("Montos:");

        jLabel9.setText("Comisión:");

        jLabel10.setText("Total Ventas:");

        jLabel11.setText("Total Comisiones:");

        ALI1.setText("$650");

        VentaTotal.setText("TotVent");

        cantVend1.setText("Cantidad1");

        AMZ1.setText("$910");

        ALI2.setText("$1.000");

        ALI3.setText("$450");

        AMZ3.setText("$630");

        Monto3.setText("Monto3");

        comisionB.setText("Com2");

        ComTotal.setText("TotCom");

        Monto2.setText("Monto2");

        cantVend3.setText("Cantidad3");

        cantVend2.setText("Cantidad2");

        comisionC.setText("Com3");

        AMZ2.setText("$1.400");

        Monto1.setText("Monto1");

        comisionA.setText("Com1");

        jButton2.setText("VENDEDOR TOP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        vendedor.setText("nombre");

        jLabel12.setText("Nombre :");

        jLabel13.setText("Codigo :");

        codVendedor.setText("code");

        jButton3.setText("🏠 Inicio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel14.setText("Total Productos :");

        totProd.setText("jLabel15");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(91, 91, 91)
                                        .addComponent(comisionA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(101, 101, 101)
                                        .addComponent(Monto1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(48, 48, 48)
                                        .addComponent(cantVend1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(62, 62, 62)
                                        .addComponent(AMZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(66, 66, 66)
                                        .addComponent(ALI1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(78, 78, 78)
                                        .addComponent(VentaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(148, 148, 148)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ALI2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AMZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cantVend2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Monto2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comisionB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ComTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totProd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2)))))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Monto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ALI3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AMZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cantVend3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comisionC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(codVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 87, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1))
                    .addComponent(jButton3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ALI1)
                    .addComponent(ALI2)
                    .addComponent(ALI3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AMZ2)
                    .addComponent(AMZ1)
                    .addComponent(AMZ3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cantVend2)
                    .addComponent(cantVend1)
                    .addComponent(cantVend3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Monto1)
                    .addComponent(Monto2)
                    .addComponent(Monto3))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comisionB)
                    .addComponent(comisionA)
                    .addComponent(comisionC))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(VentaTotal)
                    .addComponent(vendedor)
                    .addComponent(jLabel12))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ComTotal)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codVendedor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(totProd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principal.mostrarVentanaIngresar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Declaracion de un arreglo temporal para almacenar lo que retorna el metodo mejorVendedor
        String[] temp=new String[8];
        temp=mejorVendedor();
        Principal.mostrarVentanaTop(temp);
        // Entrega como parametro el arreglo temporal que trae todos los datos del mejor vendedor
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Principal.mostrarVentanaPrincipal();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void setDatos(String nombre, String code, String c1, String c2, String c3,String t1,String t2,String t3) {
        // Declaración de la variable para el monto de ventas.
        int monto;
        // Establece el texto del componente ALI1 con el precio del primer artículo de AliExpress.
        ALI1.setText("$" + precioAli1 + "");
        // Establece el texto del componente ALI2 con el precio del segundo artículo de AliExpress.
        ALI2.setText("$" + precioAli2 + "");
        // Establece el texto del componente ALI3 con el precio del tercer artículo de AliExpress.
        ALI3.setText("$" + precioAli3 + "");
        // Establece el texto del componente AMZ1 con el precio del primer artículo de Amazon.
        AMZ1.setText("$" + precioAmz1 + "");
        // Establece el texto del componente AMZ2 con el precio del segundo artículo de Amazon.
        AMZ2.setText("$" + precioAmz2 + "");
        // Establece el texto del componente AMZ3 con el precio del tercer artículo de Amazon.
        AMZ3.setText("$" + precioAmz3 + "");
        // Establece el texto del componente cantVend1 con la cantidad vendida del primer artículo.
        cantVend1.setText(String.valueOf(c1));
        // Establece el texto del componente cantVend2 con la cantidad vendida del segundo artículo.
        cantVend2.setText(String.valueOf(c2));
        // Establece el texto del componente cantVend3 con la cantidad vendida del tercer artículo.
        cantVend3.setText(String.valueOf(c3));
        // Calcula el monto para el primer artículo y establece el texto del componente Monto1.
        monto = Integer.parseInt(c1) * precioAmz1;
        Monto1.setText("$" + monto + "");
        // Calcula la comisión para el primer artículo y establece el texto del componente comisionA.
        comisionA.setText("$" + monto * comA + "");
        // Calcula el monto para el segundo artículo y establece el texto del componente Monto2.
        monto = Integer.parseInt(c2) * precioAmz2;
        Monto2.setText("$" + monto + "");
        // Calcula la comisión para el segundo artículo y establece el texto del componente comisionB.
        comisionB.setText("$" + monto * comB + "");
        // Calcula el monto para el tercer artículo y establece el texto del componente Monto3.
        monto = Integer.parseInt(c3) * precioAmz3;
        Monto3.setText("$" + monto + "");
        // Calcula la comisión para el tercer artículo y establece el texto del componente comisionC.
        comisionC.setText("$" + monto * comC + "");
        // Establece el texto del componente VentaTotal con el total de ventas.
        VentaTotal.setText("$" + t1);
        // Establece el texto del componente ComTotal con el total de comisiones.
        ComTotal.setText("$" + t2);
        // Establece el texto del componente totProd con el total de productos vendidos.
        totProd.setText(t3);
        // Establece el texto del componente vendedor con el nombre del vendedor.
        vendedor.setText(nombre);
        // Establece el texto del componente codVendedor con el código del vendedor.
        codVendedor.setText(code);
    }
    public void agregarDatos(String nombre, String code, String c1, String c2, String c3,String t1,String t2,String t3){
        // Metodo para almacenar los datos recibidos en el arrray llamado vendedores
        vendedores[cont][0]=t1;// t1 Es el total de ventas del vendedor
        vendedores[cont][1]=nombre;// nombre del vendedor
        vendedores[cont][2]=code;// codigo de trabajo del vendedor
        vendedores[cont][3]=c1;
        vendedores[cont][4]=c2;
        vendedores[cont][5]=c3;
        vendedores[cont][6]=t2;
        vendedores[cont][7]=t3;
        cont++;
    }
    public String[] mejorVendedor() {
        // Crea un array de Strings para almacenar los datos del mejor vendedor.
        String[] datos = new String[8];
        // Inicializa la variable top para mantener el mayor número de ventas encontrado.
        int top = 0;
        // Inicializa la variable fila para almacenar la fila del mejor vendedor.
        int fila = 0;
        // Recorre el array vendedores desde el primer elemento hasta el índice cont.
        for (int q = 0; q <= cont; q++) {
            // Si el segundo elemento de la fila actual es "0", se detiene el bucle.
            if ("0".equals(vendedores[q][1])) {
                break;
            }
            // Convierte el primer elemento de la fila actual a un entero (número de ventas).
            int ventas = Integer.parseInt(vendedores[q][0]);
            // Si el número de ventas de la fila actual es mayor que el valor actual de top,
            // actualiza top y fila para reflejar el mejor vendedor encontrado.
            if (ventas > top) {
                top = ventas;
                fila = q;
            }
        }
        // Copia los datos del mejor vendedor encontrado en el array datos.
        datos[0] = vendedores[fila][0];
        datos[1] = vendedores[fila][1];
        datos[2] = vendedores[fila][2];
        datos[3] = vendedores[fila][3];
        datos[4] = vendedores[fila][4];
        datos[5] = vendedores[fila][5];
        datos[6] = vendedores[fila][6];
        datos[7] = vendedores[fila][7];
        // Retorna el array datos con la información del mejor vendedor.
        return datos;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALI1;
    private javax.swing.JLabel ALI2;
    private javax.swing.JLabel ALI3;
    private javax.swing.JLabel AMZ1;
    private javax.swing.JLabel AMZ2;
    private javax.swing.JLabel AMZ3;
    private javax.swing.JLabel ComTotal;
    private javax.swing.JLabel Monto1;
    private javax.swing.JLabel Monto2;
    private javax.swing.JLabel Monto3;
    private javax.swing.JLabel VentaTotal;
    private javax.swing.JLabel cantVend1;
    private javax.swing.JLabel cantVend2;
    private javax.swing.JLabel cantVend3;
    private javax.swing.JLabel codVendedor;
    private javax.swing.JLabel comisionA;
    private javax.swing.JLabel comisionB;
    private javax.swing.JLabel comisionC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel totProd;
    private javax.swing.JLabel vendedor;
    // End of variables declaration//GEN-END:variables

}
