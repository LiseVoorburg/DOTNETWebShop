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

            Login_Button.Content = winkelService.Test("hoi");

        }

        private void Buy_Button_Click(object sender, RoutedEventArgs e)
        {

        }

        private void Refresh_Button_Click(object sender, RoutedEventArgs e)
        {

        }

        private void Register_Button_Click(object sender, RoutedEventArgs e)
        {

        }
    }
}
