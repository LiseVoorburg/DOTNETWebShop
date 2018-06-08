using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.ServiceModel;
using WcfWebShopLibrary;
using WebShopHost;
using System.Diagnostics;

namespace WebshopGUI
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        IWebShopService winkelService = new WebShopService();
        Gebruiker ingelogd;

        public static string ReverseString(string s)
        {
            char[] arr = s.ToCharArray();
            Array.Reverse(arr);
            return new string(arr);
        }

        private void Login_Button_Click(object sender, RoutedEventArgs e)
        {

            
            ingelogd = winkelService.Login(Login_Username_Textbox.Text, Login_Password_Textbox.Text);
            List<Product> producten = winkelService.getProducten();
            if (ingelogd != null)
            {
                User_Label.Content = ingelogd.Naam;
                Saldo_Label.Content = ingelogd.Saldo;

                foreach (Product p in producten)
                {
                    Products_ForSale_ListBox.Items.Add(p);
                }
                
            } else
            {
                MessageBox.Show("Verkeerde inlog kut!");
            }

        }

        private void Register_Button_Click(object sender, RoutedEventArgs e)
        {
            string username = Register_Username_Textbox.Text;
            if (winkelService.RegisterUser(username, ReverseString(username)))
            {
                Register_Password_Label.Content = ReverseString(username);
            } else
            {
                MessageBox.Show("fuck you vieze hacker!");
            }
        }



        private void Buy_Button_Click(object sender, RoutedEventArgs e)
        {
            Product product = Products_ForSale_ListBox.SelectedItem as Product;

            if (ingelogd.Saldo == 0 || product.Prijs > ingelogd.Saldo)
            {
                MessageBox.Show("fuck you cheap bitch!");
            } else
            {
                ingelogd = winkelService.KoopProduct(ingelogd, product); 
                Saldo_Label.Content = ingelogd.Saldo;
                foreach (OrderRegel or in ingelogd.Order.OrderRegel)
                {
                    Product_Inventory_ListBox.Items.Add(or);
                }
            }
        }

        private void Refresh_Button_Click(object sender, RoutedEventArgs e)
        {
           
        }


    }
}
