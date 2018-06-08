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

        private void Login_Button_Click(object sender, RoutedEventArgs e)
        {
            Gebruiker g1 = winkelService.Login(Login_Username_Textbox.Text, Login_Password_Textbox.Text);
            if (g1 != null)
            {
                User_Label.Content = g1.Naam;
                Saldo_Label.Content = g1.Saldo;
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

        public static string ReverseString(string s)
        {
            char[] arr = s.ToCharArray();
            Array.Reverse(arr);
            return new string(arr);
        }

        private void Buy_Button_Click(object sender, RoutedEventArgs e)
        {

        }

        private void Refresh_Button_Click(object sender, RoutedEventArgs e)
        {

        }


    }
}
