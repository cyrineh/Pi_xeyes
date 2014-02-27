/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.presentation;

import gc.dao.PrestataireDAO;
import gc.entities.Prestataire;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cyrine
 */
public class AfficherPrestataire extends AbstractTableModel
{
    
    List <Prestataire> prestataires;
//String [] columTab = {"id","mot de passe", "mail","Nom","adresse","tel","logo","service"};
String [] columTab = {"id","Nom","service"};
    public AfficherPrestataire() {
        PrestataireDAO prestataireDAO = new PrestataireDAO();
        prestataires = prestataireDAO.DisplayAllPrestataires();

    }
    
    public AfficherPrestataire(String str)
    {
         PrestataireDAO prestataireDAO = new PrestataireDAO();
        prestataires = prestataireDAO.recherchePrestataires_parSousNom(str);
    }
   
    /*public void addRow(Prestataire p)
    {
        prestataires.add(p);
        fireTableRowsInserted(prestataires.size() - 1, prestataires.size() - 1);
    }*/
    
    @Override
    public int getRowCount() {
       return  prestataires.size();
    }
    @Override
  public int getColumnCount() {
       return columTab.length;
    }
    @Override
 public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
          
          case 0 : return prestataires.get(rowIndex).getId();
          case 1 : return prestataires.get(rowIndex).getPseudo();
          case 2 : return prestataires.get(rowIndex).getService();
         
          default: return null;
       }
    }

    @Override
    public String getColumnName(int column) {
       return  columTab[column];
    }


    
}
